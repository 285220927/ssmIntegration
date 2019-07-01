/*
 * @Project: ssm_start
 * @Package ssm.dao
 * @author: zzc
 * @date Date: 2019年06月30日 上午2:15
 * @version V1.0
 */

package ssm.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ssm.domain.Account;

import java.util.List;

@Repository("accountDao")
public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account(money, user_id) values(#{money}, #{user_id})")
    public void saveAccount(Account account);
}
