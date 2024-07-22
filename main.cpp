#include <iostream>
#include <iostream>
using namespace std;


//ESTRUCTURA PARA CREAR UN NODO
struct nodo{
char nombre;//nombre del vertice o nodo
struct nodo *siguiente;
struct arista *adyacencia;//puntero - primera arista del nodo
};

//ESTRUCTURA PARA CREAR UNA ARISTA
struct arista{
struct nodo *destino;//puntero al nodo llegada
struct arista *siguiente;
};

//ASIGNAMOS UN NOMBRE PARA REFERIRINOS A LOS structs
typedef struct nodo *Tnodo;// Nodo
typedef struct arista *Tarista; // Arista

//APUNTA AL PRIMER NODO DE LA ESTRUCTURA
Tnodo p;//puntero cabeza

//PROTOTIPOS DE FUNCION
void menu();
void insertar_nodo();
void agrega_arista(Tnodo &, Tnodo &, Tarista &);
void insertar_arista();
void vaciar_aristas(Tnodo &);
void mostrar_grafo();
void eliminar_nodo();
void eliminar_arista();
void mostrar_aristas();

int main(int argc, char *argv[])
{
    p=NULL;
    int op;
    do{
        menu();
        cin>>op;
        switch(op)
        {
            case 1: insertar_nodo();break;
            case 2: insertar_arista(); break;
            case 3: eliminar_nodo(); break;
            case 4: eliminar_arista(); break;
            case 5: mostrar_grafo(); break;
            case 6: mostrar_aristas(); break;
            default: cout<<"OPCION NO VALIDA"; break;
        }
        cout<<endl<<endl;
        system("pause"); system("cls");
    }while(op!=7);

system("PAUSE");
return 0;
}

void menu(){
    cout<<"\n\t GRAFOS DIRIGIDO \n\n";
    cout<<" 1. INSERTAR UN NODO "<<endl;
    cout<<" 2. INSERTAR UNA ARISTA "<<endl;
    cout<<" 3. ELIMINAR UN NODO "<<endl;
    cout<<" 4. ELIMINAR UNA ARISTA "<<endl;
    cout<<" 5. MOSTRAR GRAFO "<<endl;
    cout<<" 6. MOSTRAR ARISTAS DE UN NODO "<<endl;
    cout<<" 7. SALIR "<<endl;
    cout<<"\n INGRESE OPCION: ";
}

void insertar_nodo(){
    // Se declara un puntero 't' y se crea un nuevo nodo con 'new'
    Tnodo t,nuevo=new struct nodo;
    // Se solicita al usuario que ingrese un valor para el nombre del nuevo nodo
    cout<<"INGRESE VARIABLE:";
    cin>>nuevo->nombre;
    // Se inicializan los punteros siguiente y adyacencia del nuevo nodo
    nuevo->siguiente = NULL;
    nuevo->adyacencia=NULL;
    // Si el grafo está vacío (el puntero 'p' es NULL), se asigna el nuevo nodo como el primero
    if(p==NULL){
        p = nuevo;
        cout<<"PRIMER NODO";
    }else {
        // Si el grafo no está vacío, se recorre la lista hasta el último nodo
        t = p;
        while(t->siguiente!=NULL){
            t = t->siguiente;
        }
        // Se añade el nuevo nodo al final de la lista
        t->siguiente = nuevo;
        cout<<"NODO INGRESADO";
    }
}

void agrega_arista(Tnodo &aux, Tnodo &aux2, Tarista &nuevo) {
    Tarista q;
    // Si el nodo de origen no tiene aristas salientes, se agrega la primera arista
    if(aux->adyacencia==NULL){
        aux->adyacencia=nuevo;
        nuevo->destino=aux2;
        cout<<"PRIMERA ARISTA";
    }else{
        // Si el nodo de origen ya tiene aristas salientes, se recorre la lista hasta el final
        q=aux->adyacencia;
        while(q->siguiente!=NULL)
            q=q->siguiente;
        // Se agrega la nueva arista al final de la lista
        nuevo->destino=aux2;
        q->siguiente=nuevo;
        cout<<"ARISTA AGREGADA";
    }
}

void insertar_arista(){
    char ini, fin;
    Tarista nuevo=new struct arista;
    Tnodo aux, aux2;
     // Verifica si el grafo está vacío
    if(p==NULL) {
        cout<<"GRAFO VACIO"; return;
    }
    // Inicializa la nueva arista
    nuevo->siguiente=NULL;
    // Solicita al usuario ingresar los nombres de los nodos de inicio y final
    cout<<"INGRESE NODO DE INICIO:";
    cin>>ini;
    cout<<"INGRESE NODO FINAL:";
    cin>>fin;
     // Inicializa dos nodos auxiliares para buscar los nodos de inicio y final
    aux=p;
    aux2=p;
     // Busca el nodo de destino en la lista de nodos
    while(aux2!=NULL){
        if(aux2->nombre==fin) { break;}
        aux2=aux2->siguiente;
    }
    // Busca el nodo de inicio en la lista de nodos
    while(aux!=NULL){
        if(aux->nombre==ini){
            // Llama a la función agrega_arista para agregar la arista al grafo
            agrega_arista(aux,aux2, nuevo);
            return;
        }
        aux = aux->siguiente;
    }
}

void vaciar_aristas(Tnodo &aux){
    Tarista q,r;
    // Inicializa q con la primera arista del nodo aux
    q=aux->adyacencia;
    // Recorre la lista de aristas hasta el final
    while(q->siguiente!=NULL){
        // Guarda la arista actual en r
        r=q;
        // Mueve q al siguiente nodo en la lista de aristas
        q=q->siguiente;
        // Elimina el nodo anterior (r)
        delete(r);
    }
}

void mostrar_grafo(){
    Tnodo ptr;
    Tarista arista;
    // Inicializa el puntero 'ptr' con la cabeza del grafo
    ptr=p;
    // Imprime la cabecera de la tabla
    cout<<"NODO|LISTA DE ADYACENCIA\n";
    // Recorre la lista de nodos
    while(ptr!=NULL){
        // Imprime el nombre del nodo actual
        cout<<" "<<ptr->nombre<<"|";
        // Verifica si el nodo tiene aristas salientes
        if(ptr->adyacencia!=NULL){
            // Inicializa el puntero 'arista' con la primera arista del nodo
            arista=ptr->adyacencia;
            // Recorre la lista de aristas salientes del nodo
            while(arista!=NULL){
                // Imprime el nombre del nodo de destino de la arista
                cout<<" "<<arista->destino->nombre;
                // Mueve 'arista' al siguiente nodo en la lista
                arista=arista->siguiente;
            }
        }
        // Mueve 'ptr' al siguiente nodo en la lista
        ptr=ptr->siguiente;
        // Salto de línea para pasar al siguiente nodo en la salida
        cout<<endl;
    }
}

void eliminar_nodo(){
    char nodoEliminar;
    Tnodo aux, anterior;

    // Verifica si el grafo está vacío
    if (p == NULL) {
        cout << "GRAFO VACIO";
        return;
    }
    // Solicita el nombre a eliminar
    cout << "INGRESE NODO A ELIMINAR:";
    cin >> nodoEliminar;
    aux = p;
    anterior = NULL;
    // Busca el nodo a eliminar
    while (aux != NULL) {
        if (aux->nombre == nodoEliminar) {
            // Checa si el nodo a elimanr es el primero
            if (anterior == NULL) {
                p = aux->siguiente;
            } else {
                anterior->siguiente = aux->siguiente;
            }
            // Verifica si el nodo tiene aristas
            if (aux->adyacencia != NULL) {
                // Vacía la lista de aristas del nodo antes de eliminarlo
                vaciar_aristas(aux);
            }
            // Elimina el nodo
            delete aux;
            cout << "NODO ELIMINADO";
            return;
        }
        anterior = aux;
        aux = aux->siguiente;
    }
    cout << "NODO NO ENCONTRADO";
}

void eliminar_arista(){
    char nodoInicio, nodoFinal;
    Tnodo aux, aux2;
    Tarista anterior, actual;
    // Verifica si el grafo está vacío
    if(p==NULL) {
        cout<<"GRAFO VACIO"; return;
    }
    // Solicita al usuario ingresar los nombres de los nodos de inicio y final
    cout<<"INGRESE NODO DE INICIO:";
    cin>>nodoInicio;
    cout<<"INGRESE NODO FINAL:";
    cin>>nodoFinal;
    aux=p;
    // Busca el nodo de inicio en la lista de nodos
    while(aux!=NULL){
        if(aux->nombre==nodoInicio){
            actual=aux->adyacencia;
            anterior=NULL;
            // Busca la arista a eliminar
            while(actual!=NULL){
                if(actual->destino->nombre==nodoFinal){
                    // Si la arista a eliminar es la primera
                    if(anterior==NULL){
                        aux->adyacencia=actual->siguiente;
                    }else{
                        anterior->siguiente=actual->siguiente;
                    }
                    // Elimina la arista
                    delete(actual);
                    cout<<"ARISTA ELIMINADA";
                    return;
                }
                anterior=actual;
                actual=actual->siguiente;
            }
            cout<<"ARISTA NO ENCONTRADA";
            return;
        }
        aux=aux->siguiente;
    }
    cout<<"NODO DE INICIO NO ENCONTRADO";
}
void mostrar_aristas(){
    char nodoMostrar;
    Tnodo aux;
    // Verifica si el grafo está vacío
    if(p==NULL) {
        cout<<"GRAFO VACIO"; return;
    }
    // Solicita al usuario ingresar el nombre del nodo a mostrar aristas
    cout<<"INGRESE NODO PARA MOSTRAR SUS ARISTAS:";
    cin>>nodoMostrar;
    aux=p;
    // Busca el nodo en la lista de nodos
    while(aux!=NULL){
        if(aux->nombre==nodoMostrar){
            // Verifica si el nodo tiene aristas salientes
            if(aux->adyacencia!=NULL){
                Tarista arista=aux->adyacencia;
                // Imprime las aristas salientes del nodo
                cout<<"ARISTAS DE "<<nodoMostrar<<": ";
                while(arista!=NULL){
                    cout<<" "<<arista->destino->nombre;
                    arista=arista->siguiente;
                }
            }else{
                cout<<"EL NODO NO TIENE ARISTAS SALIENTES";
            }
            return;
        }
        aux=aux->siguiente;
    }
    cout<<"NODO NO ENCONTRADO";
}
