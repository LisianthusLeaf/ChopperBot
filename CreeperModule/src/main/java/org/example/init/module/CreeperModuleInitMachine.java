package org.example.init.module;

import org.example.init.CreeperConfigInitMachine;
import org.example.init.ModuleInitMachine;
import org.example.init.TaskCenterInitMachine;
import org.example.log.ChopperLogFactory;
import org.example.log.LoggerType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.example.constpool.ConstPool.CREEPER;
import static org.example.constpool.ConstPool.FILE;

/**
 * @author Genius
 * @date 2023/07/29 01:58
 **/
public class CreeperModuleInitMachine extends ModuleInitMachine {

    public CreeperModuleInitMachine() {
        super(List.of(FILE),
                ChopperLogFactory.getLogger(LoggerType.Creeper),
                List.of(
                new CreeperConfigInitMachine(),
                new TaskCenterInitMachine()),
                CREEPER);
    }


}