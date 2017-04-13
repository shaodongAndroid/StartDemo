package com.start.demo.model;

import java.io.Serializable;

/**
 * Created by dsd on 2017/4/13.
 */

public class DataModel<T> implements Serializable {
    public int code ;
    public String msg ;

    public T data ;
}
