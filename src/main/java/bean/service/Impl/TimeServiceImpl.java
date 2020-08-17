package bean.service.Impl;

import bean.service.TimeService;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * @author bean
 * @date 2020/7/18
 */
@Service
public class TimeServiceImpl implements TimeService {
    @Override
    public Date getCurrentTime() {
        Date date = new Date();
        return date;
    }
}
