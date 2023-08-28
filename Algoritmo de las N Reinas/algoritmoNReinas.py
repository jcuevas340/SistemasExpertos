def Reinas(solucion, etapa, n):
    if etapa >= n:  # si la etapa es mayor o igual que n, entonces devolvemos falso
        return False

    exito = False  # inicializamos exito a False

    while True:
        if solucion[etapa] < n:  # si el valor de la columna para la fila es mayor o igual que n, entonces no seguimos incrementando, con esto evitamos indices fuera del array.
            solucion[etapa] = solucion[etapa] + 1  # incrementamos el valor de columna para la reina i-ésima de la fila i-ésima.

        if Valido(solucion, etapa):  # si la reina i-ésima de la fila i-ésima de la columna j en la etapa k no entra en conflicto con otra reina, proseguimos.

            if etapa != n - 1:  # si aún no hemos acabado todas las etapas, procedemos a la siguiente etapa.
                exito = Reinas(solucion, etapa + 1, n)
                if exito == False:  # si del valor devuelto de Reinas tenemos falso, ponemos a 0 el valor de la etapa + 1 para así descartar los nodos fracaso.
                    solucion[etapa + 1] = 0

            else:
                print(solucion)  # si ya hemos acabado, imprimimos la disposición de las fichas en el tablero y devolvemos True.
                for x in range(n):
                    for i in range(n):
                        if solucion[x] == i + 1:
                            print("X", end=" ")
                        else:
                            print("- ", end=" ")

                    print("\n")
                exito = True
        if solucion[etapa] == n or exito == True:  # si el valor de la columna j de la etapa k es igual a n o exito es igual a True, salimos del bucle.
            break
    
    return exito



def Valido(solucion,etapa):
	# Comprueba si el vector solucion construido hasta la etapa es 
	# prometedor, es decir, si la reina se puede situar en la columna de la etapa

	for i in range(etapa):
		if(solucion[i] == solucion[etapa]) or (ValAbs(solucion[i],solucion[etapa])==ValAbs(i,etapa)):
			return False

	return True

def ValAbs(x,y):
	if x>y:
		return x - y
	else:
		return y - x	

print("PROBLEMA DE LAS N - REINAS")
print("#"*26)
print("\n")
print("Introduce el numero de reinas:\n")

n = (int)(input())
solucion = []
for i in range(n):
	solucion.append(0)
etapa = 0
print(Reinas(solucion, etapa, n))