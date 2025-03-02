package com.ql.util.express.instruction.detail;

import java.util.List;

import com.ql.util.express.RunEnvironment;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class Instruction {
    protected static final transient Log staticLog = LogFactory.getLog(Instruction.class);
    protected static transient Log log = staticLog;
    private Integer line = 0;

    public Instruction setLine(Integer line) {
        this.line = line;
        return this;
    }

    public Integer getLine() {
        return line;
    }

    public void setLog(Log log) {
        if (log != null) {
            Instruction.log = log;
        }
    }

    public String getExceptionPrefix() {
        return "run QlExpress Exception at line " + line + " :";
    }

    public abstract void execute(RunEnvironment environment, List<String> errorList) throws Exception;
}
