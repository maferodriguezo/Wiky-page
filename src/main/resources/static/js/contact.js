document.getElementById('contactForm').addEventListener('submit', function (event) {
    let valid = true;

    // Validar nombres y apellidos
    const nombres = document.getElementById('nombres');
    const apellidos = document.getElementById('apellidos');
    if (nombres.value.length > 100 || apellidos.value.length > 100) {
        valid = false;
        document.getElementById('nombresError').textContent = 'Máximo 100 caracteres';
        document.getElementById('apellidosError').textContent = 'Máximo 100 caracteres';
    }

    // Validar correo
    const correo = document.getElementById('correo');
    const emailPattern = /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i;
    if (!emailPattern.test(correo.value)) {
        valid = false;
        document.getElementById('correoError').textContent = 'Formato de correo inválido';
    }

    // Validar semestre
    const semestre = document.getElementById('semestre');
    if (semestre.value < 0 || semestre.value > 16) {
        valid = false;
        document.getElementById('semestreError').textContent = 'El semestre debe estar entre 0 y 16';
    }

    // Validar descripción
    const descripcion = document.getElementById('descripcion');
    if (descripcion.value.length > 500) {
        valid = false;
        document.getElementById('descripcionError').textContent = 'Máximo 500 caracteres';
    }

    if (!valid) {
        event.preventDefault();
    }
});

// Contador de caracteres para la descripción
document.getElementById('descripcion').addEventListener('input', function () {
    const descripcion = document.getElementById('descripcion');
    const counter = document.getElementById('descripcionCounter');
    counter.textContent = `${descripcion.value.length}/500`;
});