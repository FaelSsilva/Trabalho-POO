#include <iostream>

class Procedimento {
protected:
    double valorBase;

public:
    Procedimento(double valor) : valorBase(valor) {}
    virtual ~Procedimento() {}

    virtual double calcularCustoTotal() const {
        return valorBase;
    }
};

class Cirurgia : public Procedimento {
private:
    double taxaAnestesia;

public:
    Cirurgia(double valor, double anestesia) 
        : Procedimento(valor), taxaAnestesia(anestesia) {}

    double calcularCustoTotal() const override {
        return valorBase + taxaAnestesia;
    }
};
