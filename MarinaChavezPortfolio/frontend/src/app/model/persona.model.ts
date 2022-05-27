export class persona{
    id?: number;
    nombre: String;
    imgperfil: String;
    redes: String;

    constructor(nombre: String, imgperfil: String, redes: String){
        this.nombre = nombre;
        this.imgperfil = imgperfil;
        this.redes = redes; 
    }
}