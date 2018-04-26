package com.liucz.listener;

import com.liucz.event.MyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 测试用自定义监听器,监听事件为MyEvent
 */
@Component
public class MyListener {

    /**
     * 对监听到的事件进行处理
     * @param myEvent
     */
    @EventListener
    @Async
    public void point(MyEvent myEvent) {

        /*
          这里不做处理，只对消息进行透传打印，实际情况，
          可以根据项目进行逻辑进行处理
         */
        myEvent.printMsg(myEvent.getMsg());
    }

}
