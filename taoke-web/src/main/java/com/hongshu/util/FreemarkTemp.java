package com.hongshu.util;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhanglei on 14/11/18.
 */
public class FreemarkTemp {

    public static void main(String[] args) throws Exception{
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("name","中华人民共和国我 爱你");
       freemarkTemp("hello.ftl",data);
    }




    public static void freemarkTemp(String templateName,Map<String,Object> data) throws  Exception{
        Configuration cfg = new Configuration();
        File file = new File("/Users/zhanglei/work/ftl");
        if(!file.exists())file.createNewFile();
        cfg.setDirectoryForTemplateLoading(file);
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        cfg.setDefaultEncoding("utf-8");


        cfg.setTagSyntax(Configuration.AUTO_DETECT_TAG_SYNTAX);
        Writer writer = new OutputStreamWriter(new FileOutputStream("/Users/zhanglei/work/freemark.txt"),"UTF-8");

        Template template = cfg.getTemplate(templateName);

        template.process(data,writer);
        writer.flush();
    }

}
