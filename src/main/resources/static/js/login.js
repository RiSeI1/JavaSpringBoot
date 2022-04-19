function check(){
        var username = document.loginForm.username.value;
        var password = document.loginForm.password.value;
        
        if (username == '' || password == ''){
            window.alert("必須項目に未入力がありました");
            
            return false;
        } else {
        return true;
    }
}