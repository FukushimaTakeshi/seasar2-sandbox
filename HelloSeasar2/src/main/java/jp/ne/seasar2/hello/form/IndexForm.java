package jp.ne.seasar2.hello.form;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class IndexForm {

    @Required
    @IntegerType
    public String arg1;

    @Required
    @IntegerType
    public String arg2;
}