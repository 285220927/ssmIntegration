/*
 * @Project: ssm_start
 * @Package PACKAGE_NAME
 * @author: zzc
 * @date Date: 2019年06月30日 上午2:24
 * @version V1.0
 */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssm.service.impl.AccountServiceImpl;

public class SsmTest {

    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
        accountService.findAll();
    }
}
