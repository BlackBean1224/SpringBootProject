package bean.service.Impl;

import bean.service.StudentQueryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bean
 * @date 2020/7/17
 */
@Service
public class StudentQueryServiceImpl implements StudentQueryService {
    @Override
    public String getDefaultStudentName() {
        return "小豆";
    }

    @Override
    public List<String> getDefaultStudentNameList() {
        List<String> studentDefaultNameList = new ArrayList<>();
        studentDefaultNameList.add("小豆");
        studentDefaultNameList.add("小黑");
        return studentDefaultNameList;
    }
}
