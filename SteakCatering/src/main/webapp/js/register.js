/*用户名验证*/
function userNameVerify() {
    // 用来检验不能为空
    var regNull = /\S/;
    // 获取用户名
    var userName = $("#userName").val();
    // 定义标志
    var flag = false;

    // 用户名验证
    $.ajax({
        type: "POST",
        url: "findUserByName.su",
        data: {
            "userName": userName
        },
        success: function (flag) {
            if (flag==1) {
                $("#userNameErr").html("× 用户名已存在");
                $("#userNameErr").css("color", "red");
                flag = false;
            }else if (!regNull.test(userName)) {
                $("#userNameErr").html("× 用户名不能为空");
                $("#userNameErr").css("color", "red");
                flag = false;
            }else {
                $("#userNameErr").html("√ 用户名可用");
                $("#userNameErr").css("color", "#00e200");
                flag = true;
            }
        }
    })

    return "1";
}

/*邮箱验证*/
function emailVerify() {
    // 用来检验不能为空
    var regNull = /\S/;
    // 用来检验邮箱格式
    var regEmail = /^\w+(\.\w+)*@\w+(\.\w+)+$/;
    // 获取邮箱
    var email = $("#email").val();

    // 邮箱验证
    $.ajax({
        type: "POST",
        url: "findUserByEmail.su",
        data: {
            "email": email
        },
        success: function (flag) {
            if (flag==1) {
                $("#emailErr").html("× 邮箱已存在");
                $("#emailErr").css("color", "red");
                return false;
            }else if(!regNull.test(email)){
                $("#emailErr").html("× 邮箱不能为空");
                $("#emailErr").css("color", "red");
                return false;
            }else if(!regEmail.test(email)){
                $("#emailErr").html("× 邮箱格式不正确");
                $("#emailErr").css("color", "red");
                return false;
            }else {
                $("#emailErr").html("√ 邮箱可用");
                $("#emailErr").css("color", "#00e200");
            }
            return true;
        }
    })
}

/*手机号验证*/
function mobileVerify() {
    // 用来检验不能为空
    var regNull = /\S/;
    // 用来检验手机
    var regPhone = /^1\d{10}$/;

    // 获取手机号
    var mobile = $("#mobile").val();

    // 手机号验证
    $.ajax({
        type: "POST",
        url: "findUserByMobile.su",
        data: {
            "mobile": mobile
        },
        success: function (flag) {
            if (flag==1) {
                $("#mobileErr").html("× 手机号已存在");
                $("#mobileErr").css("color", "red");
                return false;
            }else if(!regNull.test(mobile)){
                $("#mobileErr").html("× 手机号不能为空");
                $("#mobileErr").css("color", "red");
                return false;
            }else if(!regPhone.test(mobile)){
                $("#mobileErr").html("× 手机号格式不正确");
                $("#mobileErr").css("color", "red");
                return false;
            }else {
                $("#mobileErr").html("√ 手机号可用");
                $("#mobileErr").css("color", "#00e200");
            }
            return true;
        }
    })
}

/*密码验证*/
function pwdVerify() {
    // 用来检验不能为空
    var regNull = /\S/;
    // 用来检验密码，只能是数字和字母
    var regPwd = /^[0-9a-zA-Z]*$/;

    // 获取密码
    var pwd = $("#pwd").val();

    // 密码验证
    if(!regNull.test(pwd)){
        $("#pwdErr").html("× 密码不能为空");
        $("#pwdErr").css("color", "red");
        return false;
    }else if(!regPwd.test(pwd)){
        $("#pwdErr").html("× 只能是数字和字母");
        $("#pwdErr").css("color", "red");
        return false;
    }else if(pwd.length < 6){
        $("#pwdErr").html("× 密码必须6位以上");
        $("#pwdErr").css("color", "red");
        return false;
    }else {
        $("#pwdErr").html("√ 密码可用");
        $("#pwdErr").css("color", "#00e200");
    }
    return true;
}

/*确认密码验证*/
function rePwdVerify() {
    // 用来检验不能为空
    var regNull = /\S/;
    // 用来检验密码，只能是数字和字母
    var regPwd = /^[0-9a-zA-Z]*$/;

    // 获取密码
    var pwd = $("#pwd").val();
    // 获取确认密码
    var rePwd = $("#rePwd").val();

    // 确认密码验证
    if(!regNull.test(rePwd)){
        $("#rePwdErr").html("× 密码不能为空");
        $("#rePwdErr").css("color", "red");
        return false;
    }else if(rePwd != pwd){
        $("#rePwdErr").html("× 两次密码不一致");
        $("#rePwdErr").css("color", "red");
        return false;
    }else {
        $("#rePwdErr").html("√ 密码可用");
        $("#rePwdErr").css("color", "#00e200");
    }
    return true;
}

/*出生日期验证*/
function birthdayVerify() {
    // 用来检验不能为空
    var regNull = /\S/;
    // 获取出生日期
    var birthday = $("#birthday").val();

    // 出生日期验证
    if (!regNull.test(birthday)) {
        $("#birthdayErr").html("× 出生日期不能为空");
        $("#birthdayErr").css("color", "red");
        return false;
    } else {
        $("#birthdayErr").html("√ 出生日期可用");
        $("#birthdayErr").css("color", "#00e200");
    }
    return true;
}

/*头像验证*/
function imgVerify() {
    // 用来检验不能为空
    var regNull = /\S/;
    // 获取头像
    var img = $("#img").val();

    // 头像验证
    if (!regNull.test(img)) {
        $("#imgErr").html("× 头像不能为空");
        $("#imgErr").css("color", "red");
        return false;
    } else {
        $("#imgErr").html("√ 头像可用");
        $("#imgErr").css("color", "#00e200");
    }
    return true;
}

/*注册验证*/
function registerVerify() {
    // 用来检验不能为空
    var regNull = /\S/;
    // 用来检验邮箱格式
    var regEmail = /^\w+(\.\w+)*@\w+(\.\w+)+$/;
    // 用来检验手机
    var regPhone = /^1\d{10}$/;
    // 用来检验密码，只能是数字和字母
    var regPwd = /^[0-9a-zA-Z]*$/;

    // 获取用户名
    var userName = $("#userName").val();
    // 获取邮箱
    var email = $("#email").val();
    // 获取手机号
    var mobile = $("#mobile").val();
    // 获取密码
    var pwd = $("#pwd").val();
    // 获取确认密码
    var rePwd = $("#rePwd").val();
    // 获取出生日期
    var birthday = $("#birthday").val();
    // 获取头像
    var img = $("#img").val();

    // 用户名验证
    $.ajax({
        type: "POST",
        url: "findUserByName.su",
        data: {
            "userName": userName
        },
        success: function (flag) {
            if (flag==1) {
                $("#userNameErr").html("× 用户名已存在");
                $("#userNameErr").css("color", "red");
                return false;
            }else if (!regNull.test(userName)) {
                $("#userNameErr").html("× 用户名不能为空");
                $("#userNameErr").css("color", "red");
                return false;
            }else {
                $("#userNameErr").html("√ 用户名可用");
                $("#userNameErr").css("color", "#00e200");
            }
        }
    });

    // 邮箱验证
    $.ajax({
        type: "POST",
        url: "findUserByEmail.su",
        data: {
            "email": email
        },
        success: function (flag) {
            if (flag==1) {
                $("#emailErr").html("× 邮箱已存在");
                $("#emailErr").css("color", "red");
                return false;
            }else if(!regNull.test(email)){
                $("#emailErr").html("× 邮箱不能为空");
                $("#emailErr").css("color", "red");
                return false;
            }else if(!regEmail.test(email)){
                $("#emailErr").html("× 邮箱格式不正确");
                $("#emailErr").css("color", "red");
                return false;
            }else {
                $("#emailErr").html("√ 邮箱可用");
                $("#emailErr").css("color", "#00e200");
            }
        }
    });

    // 手机号验证
    $.ajax({
        type: "POST",
        url: "findUserByMobile.su",
        data: {
            "mobile": mobile
        },
        success: function (flag) {
            if (flag==1) {
                $("#mobileErr").html("× 手机号已存在");
                $("#mobileErr").css("color", "red");
                return false;
            }else if(!regNull.test(mobile)){
                $("#mobileErr").html("× 手机号不能为空");
                $("#mobileErr").css("color", "red");
                return false;
            }else if(!regPhone.test(mobile)){
                $("#mobileErr").html("× 手机号格式不正确");
                $("#mobileErr").css("color", "red");
                return false;
            }else {
                $("#mobileErr").html("√ 手机号可用");
                $("#mobileErr").css("color", "#00e200");
            }
        }
    });

    // 密码验证
    if(!regNull.test(pwd)){
        $("#pwdErr").html("× 密码不能为空");
        $("#pwdErr").css("color", "red");
        return false;
    }else if(!regPwd.test(pwd)){
        $("#pwdErr").html("× 只能是数字和字母");
        $("#pwdErr").css("color", "red");
        return false;
    }else if(pwd.length < 6){
        $("#pwdErr").html("× 密码必须6位以上");
        $("#pwdErr").css("color", "red");
        return false;
    }else {
        $("#pwdErr").html("√ 密码可用");
        $("#pwdErr").css("color", "#00e200");
    }

    // 确认密码验证
    if(!regNull.test(rePwd)){
        $("#rePwdErr").html("× 密码不能为空");
        $("#rePwdErr").css("color", "red");
        return false;
    }else if(rePwd != pwd){
        $("#rePwdErr").html("× 两次密码不一致");
        $("#rePwdErr").css("color", "red");
        return false;
    }else {
        $("#rePwdErr").html("√ 密码可用");
        $("#rePwdErr").css("color", "#00e200");
    }

    // 出生日期验证
    if (!regNull.test(birthday)) {
        $("#birthdayErr").html("× 出生日期不能为空");
        $("#birthdayErr").css("color", "red");
        return false;
    } else {
        $("#birthdayErr").html("√ 出生日期可用");
        $("#birthdayErr").css("color", "#00e200");
    }

    // 头像验证
    if (!regNull.test(img)) {
        $("#imgErr").html("× 头像不能为空");
        $("#imgErr").css("color", "red");
        return false;
    } else {
        $("#imgErr").html("√ 头像可用");
        $("#imgErr").css("color", "#00e200");
    }

    // 验证码验证
    if (!checkCode()){
        return false;
    }

    return true;
}










