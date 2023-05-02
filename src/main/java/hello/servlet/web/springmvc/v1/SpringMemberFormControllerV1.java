package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Component, @RequestMapping | RequestMappingHandlerMapping은 스프링 빈중에서 @ReuqestMapping 또는 @Controller가 클래스레벨에 붙어있는 경우 매핑 정보로 인식
@Controller
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process(){
        return new ModelAndView("new-form");
    }
}
