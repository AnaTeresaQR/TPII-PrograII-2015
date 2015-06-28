function formulario(form) {
    var resultadoNick = validarNick(form);
    if (form.email.value == "") {
        alert('El email no puede estar vacío');
        form.email.focus();
        return false;
    }
    if (form.password.value == "") {
        alert('La contraseña no puede estar vacía');
        form.password.focus();
        return false;
    }

}
function validarNick(form) {
    var expNick = new RegExp("^[_A-Za-z0-9]{5,12}$");
    if (expNick.test(form.nick.value)) {
        alert('formato correcto');
        return true;
    } else {
        alert('El nick esta vacío o contiene formato incorrecto');
        form.nick.focus();
        return false;
    }
}




