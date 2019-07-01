/*
 * @Project: ssm_start
 * @Package ssm.controller
 * @author: zzc
 * @date Date: 2019年06月30日 上午2:53
 * @version V1.0
 */

package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.domain.Account;
import ssm.service.AccountService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Resource(name = "accountService")
    private AccountService accountService;

    @RequestMapping("/findall")
    public String findAll(Model model) {
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);
        return "list";
    }

    @RequestMapping("/saveaccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(account);
        accountService.saveAccount(account);
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }
}
