package com.appeme.server.ewcms.api;

import com.appeme.server.ewcms.CmsException;
import com.appeme.server.ewcms.api.vo.ResultVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.WebExchangeBindException;

/**
 * BaseException拦截处理
 *
 * @author <a href="hhywangwei@gmail.com">WangWei</a>
 */
@ControllerAdvice(annotations = RestController.class)
public class EwcmsAdvice {

    @ExceptionHandler(WebExchangeBindException.class)
    @ResponseBody
    public ResultVo<String> handleValidateException(WebExchangeBindException bindException){
        return ResultVo.error(bindException.getAllErrors());
    }

    @ExceptionHandler(CmsException.class)
    @ResponseBody
    public ResultVo<String> handleCmsException(CmsException e){
        return ResultVo.error(e.getCode(), e.getMessage());
    }
}
