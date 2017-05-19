package com.budgetms.util;

/**
 * Created by KJB-001064 on 2017/5/19.
 */
public enum ErrorEnum {
//
//    public static final int DB_ER_CANT_CREATE_TABLE = 1005; // 创建表失败
//    public static final int DB_ER_CANT_CREATE_DB = 1006; // 创建数据库失败
//    public static final int DB_ER_DB_CREATE_EXISTS = 1007; // 数据库已存在，创建数据库失败
//    public static final int DB_ER_DB_DROP_EXISTS = 1008; // 数据库不存在，删除数据库失败
//    public static final int DB_ER_DB_DROP_DELETE = 1009; // 不能删除数据库文件导致删除数据库失败
//    public static final int DB_ER_DB_DROP_RMDIR = 1010; // 不能删除数据目录导致删除数据库失败
//    public static final int DB_ER_CANT_DELETE_FILE = 1011; // 删除数据库文件失败
//    public static final int DB_ER_CANT_FIND_SYSTEM_REC = 1012; // 不能读取系统表中的记录
//    public static final int DB_ER_CHECKREAD = 1020; // 记录已被其他用户修改
//    public static final int DB_ER_DISK_FULL = 1021; // 硬盘剩余空间不足，请加大硬盘可用空间
//    public static final int DB_ER_DUP_KEY = 1022; // 关键字重复，更改记录失败
//    public static final int DB_ER_ERROR_ON_CLOSE = 1023; // 关闭时发生错误
//    public static final int DB_ER_ERROR_ON_READ = 1024; // 读文件错误
//    public static final int DB_ER_ERROR_ON_RENAME = 1025; // 更改名字时发生错误
//    public static final int DB_ER_ERROR_ON_WRITE = 1026; // 写文件错误
//    public static final int DB_ER_KEY_NOT_FOUND = 1032; // 记录不存在
//    public static final int DB_ER_OPEN_AS_READONLY = 1036; // 数据表是只读的，不能对它进行修改
//    public static final int DB_ER_OUTOFMEMORY = 1037; // 系统内存不足，请重启数据库或重启服务器
//    public static final int DB_ER_OUT_OF_SORTMEMORY = 1038; // 用于排序的内存不足，请增大排序缓冲区
//    public static final int DB_ER_CON_COUNT_ERROR = 1040; // 已到达数据库的最大连接数，请加大数据库可用连接数
//    public static final int DB_ER_OUT_OF_RESOURCES = 1041; // 系统内存不足
//    public static final int DB_ER_BAD_HOST_ERROR = 1042; // 无效的主机名
//    public static final int DB_ER_HANDSHAKE_ERROR = 1043; // 无效连接
//    public static final int DB_ER_DBACCESS_DENIED_ERROR = 1044; // 当前用户没有访问数据库的权限
//    public static final int DB_ER_ACCESS_DENIED_ERROR = 1045; // 不能连接数据库，用户名或密码错误
//    public static final int DB_ER_BAD_NULL_ERROR = 1048; // 字段不能为空
//    public static final int DB_ER_BAD_DB_ERROR = 1049; // 数据库不存在
//    public static final int DB_ER_TABLE_EXISTS_ERROR = 1050; // 数据表已存在
//    public static final int DB_ER_BAD_TABLE_ERROR = 1051; // 数据表不存在
//    public static final int DB_ER_BAD_FIELD_ERROR = 1054; // 字段不存在
//    public static final int DB_ER_EMPTY_QUERY = 1065; // 无效的SQL语句，SQL语句为空
//    public static final int DB_ER_IPSOCK_ERROR = 1081; // 不能建立Socket连接
//    public static final int DB_ER_RECORD_FILE_FULL = 1114; // 数据表已满，不能容纳任何记录
//    public static final int DB_ER_TOO_MANY_TABLES = 1116; // 打开的数据表太多
//    public static final int DB_ER_HOST_IS_BLOCKED = 1129; // 数据库出现异常，请重启数据库
//    public static final int DB_ER_HOST_NOT_PRIVILEGED = 1130; // 连接数据库失败，没有连接数据库的权限
//    public static final int DB_ER_PASSWORD_NO_MATCH = 1133; // 数据库用户不存在
//    public static final int DB_ER_NONEXISTING_GRANT = 1141; // 当前用户无权访问数据库
//    public static final int DB_ER_TABLEACCESS_DENIED_ERROR = 1142; // 当前用户无权访问数据表
//    public static final int DB_ER_COLUMNACCESS_DENIED_ERROR = 1143; // 当前用户无权访问数据表中的字段
//    public static final int DB_ER_NO_SUCH_TABLE = 1146; // 数据表不存在
//    public static final int DB_ER_NONEXISTING_TABLE_GRANT = 1147; // 未定义用户对数据表的访问权限
//    public static final int DB_ER_SYNTAX_ERROR = 1149; // SQL语句语法错误
//    public static final int DB_ER_NET_READ_ERROR = 1158; // 网络错误，出现读错误，请检查网络连接状况
//    public static final int DB_ER_NET_READ_INTERRUPTED = 1159; // 网络错误，读超时，请检查网络连接状况
//    public static final int DB_ER_NET_ERROR_ON_WRITE = 1160; // 网络错误，出现写错误，请检查网络连接状况
//    public static final int DB_ER_NET_WRITE_INTERRUPTED = 1161; // 网络错误，写超时，请检查网络连接状况
//    public static final int DB_ER_DUP_ENTRY = 1062; // 字段值重复，入库失败
//    public static final int DB_ER_DUP_UNIQUE = 1169; // 字段值重复，更新记录失败
//    public static final int DB_ER_CHECK_NO_SUCH_TABLE = 1177; // 打开数据表失败
//    public static final int DB_ER_ERROR_DURING_COMMIT = 1180; // 提交事务失败
//    public static final int DB_ER_ERROR_DURING_ROLLBACK = 1181; // 回滚事务失败
//    public static final int DB_ER_TOO_MANY_USER_CONNECTIONS = 1203; // 当前用户和数据库建立的连接已到达数据库的最大连接数，请增大可用的数据库连接数或重启数据库
//    public static final int DB_ER_LOCK_WAIT_TIMEOUT = 1205; // 加锁超时
//    public static final int DB_ER_NO_PERMISSION_TO_CREATE_USER = 1211; // 当前用户没有创建用户的权限
//    public static final int DB_ER_NO_REFERENCED_ROW = 1216; // 外键约束检查失败，更新子表记录失败
//    public static final int DB_ER_ROW_IS_REFERENCED = 1217; // 外键约束检查失败，删除或修改主表记录失败
//    public static final int DB_ER_USER_LIMIT_REACHED = 1226; // 当前用户使用的资源已超过所允许的资源，请重启数据库或重启服务器
//    public static final int DB_ER_SPECIFIC_ACCESS_DENIED_ERROR = 1227; // 权限不足，您无权进行此操作
//    public static final int DB_ER_NOT_SUPPORTED_YET = 1235; // MySQL版本过低，不具有本功能
//    public static final int DB_ER_FK_CONTRAINT_FAIL = 1452;//Cannot add or update a child row: a foreign key constraint fails
//    public static final int DB_ER_VALUE_OUT_RANGE = 1264;
}
