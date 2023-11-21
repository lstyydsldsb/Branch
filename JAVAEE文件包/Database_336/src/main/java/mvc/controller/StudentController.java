package mvc.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import mvc.Service.StudentService;
import mvc.model.Student;


@RestController
@RequestMapping(value="/demo")
public class StudentController {
    @Autowired
    private StudentService svc;
    @RequestMapping(value="/select")
    public ModelAndView select(@RequestParam("name") String name) {
        ModelAndView mav=new ModelAndView("select");
        List<Student>stu=new ArrayList();
        stu=svc.findstu(name);
        mav.addObject("stu",stu);
        return mav;
    }



    @RequestMapping(value="/insert")
    public ModelAndView insertstu ( @RequestParam("name") String
                                   name,@RequestParam("city") String city,@RequestParam("assest") String assest) {
        Student stu=new Student(name, city, assest);
        svc.insertstu(stu);
        ModelAndView mav=new ModelAndView("insert");
        List<Student>stu1=new ArrayList();
        stu1=svc.findstu(name);
        mav.addObject("stu",stu1);
        return mav;
    }


    @RequestMapping(value="/delete")
    public  ModelAndView deletestu(@RequestParam("name") String name) {
        ModelAndView mav=new ModelAndView("delete");
        List<Student>stu=new ArrayList();
        stu=svc.findstu(name);
        mav.addObject("stu",stu);
        svc.deletestu(name);
        return mav;
    }





    @RequestMapping(value="/update")
    public ModelAndView updatestu ( @RequestParam("name") String
                                   name,@RequestParam("city") String city,@RequestParam("assest") String assest) {
        Student stu=new Student(name, city, assest);
        svc.updatestu(stu);
        ModelAndView mav=new ModelAndView("update");
        List<Student>stu1=new ArrayList();
        stu1=svc.findstu(name);
        mav.addObject("stu",stu1);
        return mav;
    }
    @RequestMapping(value="/view")
    public ModelAndView findall(){
        ModelAndView mav=new ModelAndView("view");
        List<Student>stu=new ArrayList();
        stu=svc.findall();
        mav.addObject("stu",stu);
        return mav;
    }

    @RequestMapping(value="/Home")
    public ModelAndView home(){
        ModelAndView mav=new ModelAndView("home");
        List<Student>stu=new ArrayList();
        stu=svc.findall();
        mav.addObject("stu",stu);
        return mav;
    }


    @RequestMapping(value="/find")
    public ModelAndView find(){
        ModelAndView mav=new ModelAndView("find");

        return mav;
    }
    @RequestMapping(value="/shanchu")
    public ModelAndView shanchu(){
        ModelAndView mav=new ModelAndView("shanchu");

        return mav;
    }
    @RequestMapping(value="/add")
    public ModelAndView add(){
        ModelAndView mav=new ModelAndView("add");

        return mav;
    }
    @RequestMapping(value="/up")
    public ModelAndView up(){
        ModelAndView mav=new ModelAndView("up");
        return mav;
    }


    @RequestMapping(value="/dl")
    public ModelAndView dl(){
        ModelAndView mav=new ModelAndView("dl");
        return mav;
    }


}