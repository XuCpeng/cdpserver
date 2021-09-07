package cn.medemede.cdpserver.dto;

import lombok.Getter;

/**
 * 返回值枚举类
 *
 * @author xcp
 */
@Getter
public enum ResultEnum {
    // 成功
    SUCCESS(0, "success"),
    // 登陆成功，管理员
    ADMAIN_LOGIN(201, "登陆成功，管理员"),
    UNKNOWN_ACCOUNT(202, "UnknownAccount,账户不存在！"),
    MORE_PWDERROR_LUCK(203, "输错密码次数过多，用户被锁定！"),
    LOG_FILED(204, "登陆失败，请检查用户名和密码"),
    CHECKCODE_ERROR(205, "验证码错误"),
    SAVEUSER_SUCCESS(206, "注册成功"),
    USER_HEAD(207, "用户已存在"),
    UPDATE_STU_SUCCESS(208, "修改个人信息成功"),
    ADD_AC_SUCCESS(209, "添加成功"),
    UPDATE_STU_FAILD(210, "修改个人信息失败");

    /**
     * 消息码
     */
    private final Integer code;

    /**
     * 消息体
     */
    private final String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
