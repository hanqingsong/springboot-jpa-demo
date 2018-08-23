package cn.song;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hanqingsong on 18/8/23.
 *
 * @author hanqingsong
 * @date 18/8/23
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaDemoApplication.class)
// @SpringBootApplication
public class LoggerTest {
    @Test
    public void test() {
        log.info("日志输出info");
        log.warn("日志输出info");
        log.error("日志输出info");
    }
}