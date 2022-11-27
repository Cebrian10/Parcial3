let baseURL = "http://localhost:8080";
let articulos = [];

function ObtenerArticulos(){
    fetch(baseURL+'/articulos/all').then(res=>{
        res.json().then(json=>{
            articulos = json;
            ImprimirArticulos();
        });
    });
}

function ImprimirArticulos(){
    let contenedor = document.getElementById("cuerpoTabla");

    articulos.forEach(articulos=>{
    contenedor.innerHTML += MapearArticulo(articulos);
    });
}

function MapearArticulo(articulos){
    return `<div class="food-menu-item">
                <div class="food-img"><img src="${articulos.foto}"/></div>
                <div class="food-description">
                <h2 class="food-titile">${articulos.bailesT}</h2>
                <p>${articulos.descripcion}</p>
            </div>`
}