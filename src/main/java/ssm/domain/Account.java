/*
 * @Project: ssm_start
 * @Package ssm.domain
 * @author: zzc
 * @date Date: 2019年06月30日 上午2:15
 * @version V1.0
 */

package ssm.domain;

public class Account {
    private Integer id;
    private Double money;
    private Integer user_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                ", user_id=" + user_id +
                '}';
    }
}
