
function validacionesformulario(form) {
    if (form.nick.value == "") {
        alert('El nick esta vacío');
        form.nick.focus();
        return false;
    }
    if (form.nombre.value == "") {
        alert('El nombre esta vacío');
        form.nombre.focus();
        return false;
    }
    if (form.email.value == "") {
        alert('El email no puede estar vacío');
        form.email.focus();
        return false;
    }
    return true;
}



