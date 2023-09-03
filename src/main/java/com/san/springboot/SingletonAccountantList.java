package com.san.springboot;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.san.springboot.bean.Accountant;

@SuppressWarnings("serial")
public class SingletonAccountantList implements Serializable, Cloneable {

    private static SingletonAccountantList accountantList;
    private static Object object = new Object();
    private List<Accountant> accountantsList;

    private SingletonAccountantList() throws CloneNotSupportedException {
        if (accountantList != null) {
            throw new CloneNotSupportedException("Not Supporting");
        }
        accountantsList = IntStream.rangeClosed(1, 11)
                .mapToObj(i -> new Accountant(i, "Accountant" + i + "Master", "Anto" + i, i * 20, i + 20, "Femal"))
                .collect(Collectors.toList());
    }

    public static SingletonAccountantList getInstance() throws CloneNotSupportedException {
        SingletonAccountantList result = accountantList; // to improve speed instead of checking
        if (result == null) {
            synchronized (object) { // for thread safty
                result = accountantList;
                if (accountantList == null) {
                    accountantList = result = new SingletonAccountantList();
                }
            }
        }
        return accountantList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new SingletonAccountantList();
    }

    // @Override for serialization
    private Object readResolve() throws ObjectStreamException {
        return accountantList;
    }

    public List<Accountant> getAccountantsList() {
        return accountantsList;
    }

}
