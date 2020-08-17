package bean.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bean
 * @date 2020/7/17
 */
public interface StudentQueryService {
    /* 默认学生名：小豆
    /*
     */
    public String getDefaultStudentName();

    /* 默认学生名：小豆
    /*
     */
    public List<String> getDefaultStudentNameList();
}
