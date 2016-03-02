package com.budgetms.util;
import java.io.File;
import java.util.*;
import org.apache.commons.fileupload.*;
import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;
import java.io.IOException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import java.util.regex.Matcher;
/**
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public class FileUploadUtil {
    //当上传文件超过限制时设定的临时文件位置，注意是绝对路径
    private String tempPath = null;
    //文件上传目标目录，注意是绝对路径
    private String dstPath = null;
    //新文件名称，不设置时默认为原文件名
    private String newFileName = null;
    //获取的上传请求
    private HttpServletRequest fileuploadReq = null;
    //设置最多只允许在内存中存储的数据,单位:字节，这个参数不要设置太大
    private int sizeThreshold = 4096;
    //设置允许用户上传文件大小,单位:字节
    //共10M
    private long sizeMax = 10485760;
    //图片文件序号
    private int picSeqNo = 1;
    private boolean isSmallPic = false;
    public FileUploadUtil(){
    }
    public FileUploadUtil(String tempPath, String destinationPath){
        this.tempPath  = tempPath;
        this.dstPath = destinationPath;
    }
    public FileUploadUtil(String tempPath, String destinationPath, HttpServletRequest fileuploadRequest){
        this.tempPath   = tempPath;
        this.dstPath = destinationPath;
        this.fileuploadReq = fileuploadRequest;
    }
    /** 文件上载
     * @return true —— success; false —— fail.
     */
    
    
  /**从路径中获取单独文件*/
    public String GetFileName(String filepath)
    {
        String returnstr = "*.*";
        int length       = filepath.trim().length();
        filepath = filepath.replace('\\', '/');
        if(length >0)
        {
            int i = filepath.lastIndexOf("/");
            if (i >= 0)
            {
                filepath  = filepath.substring(i + 1);
                returnstr = filepath;
            }
        }
        return returnstr;
    }
    /**
     * 设置临时存贮目录
     */
    public void setTmpPath(String tmppath)
    {
        this.tempPath = tmppath;
    }
    /**
     * 设置目标目录
     */
    public void setDstPath(String dstpath) {
        this.dstPath = dstpath;
    }
    /**
     * 设置最大上传文件字节数，不设置时默认10M
     */
    public void setFileMaxSize(long maxsize) {
        this.sizeMax = maxsize;
    }
    /**
     * 设置Http 请求参数，通过这个能数来获取文件信息
     */
    public void setHttpReq(HttpServletRequest httpreq) {
        this.fileuploadReq = httpreq;
    }
    /**
     * 设置Http 请求参数，通过这个能数来获取文件信息
     */
    public void setNewFileName(String filename) {
        this.newFileName = filename;
    }
    /**
     * 设置此上传文件是否是缩略图文件，这个参数主要用于缩略图命名
     */
    public void setIsSmalPic(boolean isSmallPic) {
        this.isSmallPic = isSmallPic;
    }
    /**
     * 设置Http 请求参数，通过这个能数来获取文件信息
     */
    public void setPicSeqNo(int seqNo) {
        this.picSeqNo = seqNo;
    }
}