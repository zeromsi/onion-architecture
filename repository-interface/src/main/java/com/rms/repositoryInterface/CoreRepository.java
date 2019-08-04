package com.rms.repositoryInterface;
import java.util.List;

public interface CoreRepository<T,I>{
	T save(T t,String userId);
	T findById(I i);
	List<T> findAll();

}