/*
 * @Project: ssm_start
 * @Package ssm.service
 * @author: zzc
 * @date Date: 2019年06月30日 上午2:17
 * @version V1.0
 */

package ssm.service;

import ssm.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    public void saveAccount(Account account);
}
