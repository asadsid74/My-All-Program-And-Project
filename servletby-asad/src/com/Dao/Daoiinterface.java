package com.Dao;

import java.util.List;

import com.Pojo.bean;

public interface Daoiinterface {
 void show(bean b);

 
 List <bean> GetAlldata();
 public void UpdateValues(bean b);
 public void Deletevalue(bean b);
}
