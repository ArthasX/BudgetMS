package com.budgetms.dao;


import java.util.ArrayList;
import java.util.List;


public interface IBaseDao<T> {
    T getEntityById(PK id);
	List<T> getEntity(T t);

    List<T> getEntityByCond(T t);
    List<T> updateEntityById(T t);
	List<T> updateEntityBatch(ArrayList<T> arrayList);
	int insertEntity(T t);
	int deleteEntity(T t);
	int deleteEntityById(PK id);
}
