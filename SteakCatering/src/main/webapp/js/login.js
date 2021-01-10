/*登录验证*/
function loginVerify() {
    // 用来检验不能为空
    var regNull = /\S/;
    // 用来检验密码，只能是数字和字母
    var regPwd = /^[0-9a-zA-Z]*$/;

    // 获取用户名
    var userName = $("#userName").val();
    // 获取密码
    var pwd = $("#pwd").val();

    // 用户名验证
    if (!regNull.test(userName)) {
        $("#userNameErr").html("× 用户名不能为空");
        $("#userNameErr").css("color", "red");
        return false;
    }else {
        $("#userNameErr").html("√ 用户名可用");
        $("#userNameErr").css("color", "#00e200");
    }

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

    // 验证码验证
    if (!checkCode()){
        return false;
    }

    return true;
}

/*用户名验证*/
function userNameVerify() {
    // 用来检验不能为空
    var regNull = /\S/;
    // 获取用户名
    var userName = $("#userName").val();

    // 用户名验证
    if (!regNull.test(userName)) {
        $("#userNameErr").html("× 用户名不能为空");
        $("#userNameErr").css("color", "red");
    }else {
        $("#userNameErr").html("√ 用户名可用");
        $("#userNameErr").css("color", "#00e200");
    }
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
    }else if(!regPwd.test(pwd)){
        $("#pwdErr").html("× 只能是数字和字母");
        $("#pwdErr").css("color", "red");
    }else if(pwd.length < 6){
        $("#pwdErr").html("× 密码必须6位以上");
        $("#pwdErr").css("color", "red");
    }else {
        $("#pwdErr").html("√ 密码可用");
        $("#pwdErr").css("color", "#00e200");
    }
}









