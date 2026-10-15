#include <iostream>
#include <string>

class MidiaAudio {
protected:
    std::string titulo;

public:
    MidiaAudio(std::string t) : titulo(t) {}
    virtual ~MidiaAudio() {}

    virtual void tocar() const = 0;
};

class Podcast : public MidiaAudio {
private:
    int episodio;

public:
    Podcast(std::string t, int ep) : MidiaAudio(t), episodio(ep) {}

    void tocar() const override {
        std::cout << "A tocar Podcast " << titulo << " Ep. " << episodio << std::endl;
    }
};
