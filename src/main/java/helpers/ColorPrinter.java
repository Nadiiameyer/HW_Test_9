package helpers;

import com.sun.istack.internal.NotNull;
import org.apache.logging.log4j.Logger;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.RESET;
import static java.awt.Color.*;

public class ColorPrinter {
    public static void printMessageInYellow(String message){
        System.out.println(YELLOW + message + RESET);
    }
    public static printColorMessage(String message, Logger logger,@NotNull Level level){
        switch (level){
            case INFO:
                logger.info(GREEN + message);
                break;
            case DEBUG:
                logger.debug(BLUE + message + RESET);
                break;
            case ERROR:
                logger.error(RED + message + RESET);
        }
    }
}
