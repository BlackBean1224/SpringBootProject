package bean.controller.QueryController;

import bean.service.Impl.StudentQueryServiceImpl;
import bean.service.Impl.TimeServiceImpl;
import bean.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author bean
 * @date 2020/7/9
 */

@Controller
public class queryTestController {
    @Autowired
    private StudentQueryServiceImpl studentQueryService;

    @Autowired
    private TimeServiceImpl timeService;

    @RequestMapping(value = {"/querytest"})
    @ResponseBody
    public String queryTest(@RequestParam(value = "student_name") String studentName) {
        if (StringUtils.isEmpty(studentName)) {
            return "默认学生名" + studentQueryService.getDefaultStudentName();
        }
        return "学生名是： " + studentName;
    }

    @RequestMapping(value = {"/querytest/studentlist"})
    @ResponseBody
    public List<String> queryListTest(@RequestParam(value = "student_names", required = false) List<String> studentNames) {
        if (null == studentNames || studentNames.size() == 0) {
            return studentQueryService.getDefaultStudentNameList();
        }
        return studentNames;
    }

    @RequestMapping(value = {"/querytest/time"})
    @ResponseBody
    public String queryTimeTest() {
        Date date = timeService.getCurrentTime();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return ft.format(date);
    }
}
