package com.daointerface;

import java.util.List;

import com.userbean.UserPojo;

public interface Daointerface {
 void crud( UserPojo up);
 List<UserPojo> fetch();
 
}
