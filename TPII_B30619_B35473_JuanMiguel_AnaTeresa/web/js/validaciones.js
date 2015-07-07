function formulario(form) {
    var resultadoNick = validarNick(form);
    var resultadoEmail = validarEmail(form);
    var resultadoPassword = validarPassword(form);
    if (resultadoNick && resultadoEmail && resultadoPassword) {
        return true;
    } else {
        return false;
    }
}
function validarNick(form) {
    var expNick = new RegExp("^[_A-Za-z0-9]{5,12}$");
    if (expNick.test(form.nick.value)) {
        return true;
    } else {
        alert('El nick esta vacío o contiene formato incorrecto');
        form.nick.focus();
        return false;
    }
}
function validarEmail(form) {
    var expEmail = new RegExp("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    if (expEmail.test(form.email.value)) {
        return true;
    } else {
        alert('El email esta vacío o contiene formato incorrecto');
        form.email.focus();
        return false;
    }
}
function validarPassword(form) {
    var expPassword = new RegExp("^[a-zA-Z]+[0-9]+$");
    if (expPassword.test(form.password.value) && form.password.value.length >= 5) {
        return true;
    } else {
        alert('El password esta vacío o contiene formato incorrecto');
        form.password.focus();
        return false;
    }
}
function logIn(form) {
    var validarPass = validarPassword(form);
    var validarIdent = validarIdentificador(form);
    if (validarPass && validarIdent) {
        return true;
    } else {
        return false;
    }
}

function validarIdentificador(form) {
    if (form.identificador.value.length >= 5) {
        return true;
    } else {
        alert('El Identificador vacío o contiene formato incorrecto');
        form.identificador.focus();
        return false;
    }
}

<<<<<<< HEAD
=======
function noVacios(form) {
    if (form.nombre.value != "") {

        if (form.personalidad.value != "") {

            if (form.descripcion.value != "") {

                if (form.img.value != "") {
                    return true;
                }
                // no foto
                alert('Debes darnos una foto');
                form.img.focus();
                return false;
            }
            // no descripcion
            alert('Debes poder describirlo');
            form.descripcion.focus();
            return false;
        }
        // no personalidad
        alert('Debes poder poner su personalidad');
        form.personalidad.focus();
        return false;
    }
    // no nombre
    alert('Vamos, debes saber su nombre');
    form.nombre.focus();
    return false;
}

>>>>>>> origin/Rama-JSP


