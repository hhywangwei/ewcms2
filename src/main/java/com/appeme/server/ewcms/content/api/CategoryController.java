package com.appeme.server.ewcms.content.api;

import com.appeme.server.ewcms.api.validate.Update;
import com.appeme.server.ewcms.api.vo.OkVo;
import com.appeme.server.ewcms.api.vo.ResultPageVo;
import com.appeme.server.ewcms.api.vo.ResultVo;
import com.appeme.server.ewcms.content.api.form.CategoryForm;
import com.appeme.server.ewcms.content.domain.Category;
import com.appeme.server.ewcms.content.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/content/category")
@Api(value = "/content/category", tags = "文章分类API接口")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation("添加文章分类")
    public ResultVo<Category> save(@Validated @RequestBody CategoryForm form){

        return ResultVo.success(service.save(form.toDomain()));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation("修改文章分类")
    public ResultVo<Category> update(@Validated({Update.class}) @RequestBody CategoryForm form){

        return ResultVo.success(service.update(form.toDomain()));
    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation("得到文章分类")
    public ResultVo<Category> get(@PathVariable(value = "id")String id){

        return ResultVo.success(service.get(id));
    }

    @DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation("删除文章分类")
    public ResultVo<OkVo> delete(@PathVariable(value = "id")String id){

        return ResultVo.success(new OkVo(service.delete(id)));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation("查询文章分类")
    public ResultPageVo<Category> query(@RequestParam(required = false) String name,
                                        @RequestParam(defaultValue = "false") Boolean isCount,
                                        @RequestParam(defaultValue = "0") Integer page,
                                        @RequestParam(defaultValue = "15") Integer size){

        Page<Category> p = service.query(isCount, name, PageRequest.of(page, size));
        return ResultPageVo.of(p, page, size);
    }
}
