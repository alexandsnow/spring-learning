package com.gy.claus.task;

import com.alibaba.fastjson.JSON;
import com.gy.claus.Util.GyLogTagUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GyTask implements Runnable {

    private static final Logger logger = LogManager.getLogger(GyTask.class);

    @Override
    public void run() {
        GyLogTagUtil.put("threadNames", Thread.currentThread().getName());
        logger.info(JSON.toJSONString(GyLogTagUtil.get()));
    }
}
