package com.saretto.aopdemo.dao;

import com.saretto.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);
}
