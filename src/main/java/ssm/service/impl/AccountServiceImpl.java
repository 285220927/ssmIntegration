/*
 * @Project: ssm_start
 * @Package ssm.service.impl
 * @author: zzc
 * @date Date: 2019年06月30日 上午2:18
 * @version V1.0
 */

package ssm.service.impl;

import org.springframework.stereotype.Service;
import ssm.dao.AccountDao;
import ssm.domain.Account;
import ssm.service.AccountService;

import javax.annotation.Resource;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("查询所有账户信息");
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}
