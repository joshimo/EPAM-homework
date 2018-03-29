package assigment08;

import com.joshimo.utils.Level;
import com.joshimo.utils.WindowLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ExceptionTest {

    private Object object;
    private WindowLogger windowLogger;
    private Logger systemLogger = Logger.getLogger(ExceptionTest.class.getName());

    public ExceptionTest() {
        windowLogger = WindowLogger.getInstance();
        windowLogger.showStackTrace(true);
        systemLogger.setLevel(java.util.logging.Level.FINEST);
    }

    private void method01() {
        try {
            object.notify();
        } catch (NullPointerException npe) {
            windowLogger.log(npe);
            systemLogger.log(java.util.logging.Level.WARNING, "Exception", npe);
        }
    }

    private void method02() {
        class ExceptionGenerator {

            private void generateException() throws IOException {
                throw new IOException("IOException!");
            }

            private void interceptException() {
                try {
                    generateException();
                } catch (IOException ioe) {
                    windowLogger.log(ioe);
                    systemLogger.log(java.util.logging.Level.WARNING, "IOException!", ioe);
                } finally {
                    windowLogger.log(Level.FINE, "Exception caught in interceptException()");
                    systemLogger.log(java.util.logging.Level.INFO, "Exception caught in interceptException()");
                }
            }
        }
        ExceptionGenerator generator = new ExceptionGenerator();
        generator.interceptException();
    }

    private void method03() throws Exception {
        class ExceptionGenerator {

            private void generateException() throws IOException {
                throw new IOException("IOException!");
            }

            private void interceptAndThrowException(Integer i) throws Exception {
                try {
                    generateException();
                } catch (IOException ioe) {
                    windowLogger.log(ioe);
                    systemLogger.log(java.util.logging.Level.WARNING, "IOException!", ioe);
                    if (i == null)
                        throw new NullPointerException("NullPointerException after catching IOException!");
                } finally {
                    windowLogger.log(Level.FINE, "IOException caught in interceptException()");
                    systemLogger.log(java.util.logging.Level.INFO, "IOException caught in interceptException()");
                }
            }
        }
        ExceptionGenerator generator = new ExceptionGenerator();
        generator.interceptAndThrowException(null);
    }

    private void method04B() {
        List<String> list = new ArrayList<>();
        while (true)
            list.add("a");
    }

    private void method04A() {
        method04A();
    }

    public static void main(String[] args) throws Exception {
        ExceptionTest test = new ExceptionTest();
        test.method01();
        test.method02();
        test.method03();
        //test.method04A();
        //test.method04B();
    }

}
