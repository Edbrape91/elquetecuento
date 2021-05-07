function form_fields(input) {
    var cliente = new Object();
    var nombre;

    var inputs = document.querySelectorAll(input);
    for (i in inputs) {
        nombre = inputs[i].name;
        if (inputs[i].type == 'radio') {
            if (inputs[i].checked) {
                cliente[nombre] = inputs[i].value;
            }
        } else {

            cliente[nombre] = inputs[i].value;
        }
    }

    var id = cliente.nif;
    window.localStorage.setItem(id, JSON.stringify(cliente));
}