package games.perses.sfml.input

import sfml.*

enum class Keys(val keyCode: Int) {
    A(sfKeyA),
    B(sfKeyB),
    C(sfKeyC),
    D(sfKeyD),
    E(sfKeyE),
    F(sfKeyF),
    G(sfKeyG),
    H(sfKeyH),
    I(sfKeyI),
    J(sfKeyJ),
    K(sfKeyK),
    L(sfKeyL),
    M(sfKeyM),
    N(sfKeyN),
    O(sfKeyO),
    P(sfKeyP),
    Q(sfKeyQ),
    R(sfKeyR),
    S(sfKeyS),
    T(sfKeyT),
    U(sfKeyU),
    V(sfKeyV),
    W(sfKeyW),
    X(sfKeyX),
    Y(sfKeyY),
    Z(sfKeyZ),
    NUM0(sfKeyNum0),
    NUM1(sfKeyNum1),
    NUM2(sfKeyNum2),
    NUM3(sfKeyNum3),
    NUM4(sfKeyNum4),
    NUM5(sfKeyNum5),
    NUM6(sfKeyNum6),
    NUM7(sfKeyNum7),
    NUM8(sfKeyNum8),
    NUM9(sfKeyNum9),
    NUMPAD0(sfKeyNumpad0),
    NUMPAD1(sfKeyNumpad1),
    NUMPAD2(sfKeyNumpad2),
    NUMPAD3(sfKeyNumpad3),
    NUMPAD4(sfKeyNumpad4),
    NUMPAD5(sfKeyNumpad5),
    NUMPAD6(sfKeyNumpad6),
    NUMPAD7(sfKeyNumpad7),
    NUMPAD8(sfKeyNumpad8),
    NUMPAD9(sfKeyNumpad9),
    ESC(sfKeyEscape),
    F1(sfKeyF1),
    F2(sfKeyF2),
    F3(sfKeyF3),
    F4(sfKeyF4),
    F5(sfKeyF5),
    F6(sfKeyF6),
    F7(sfKeyF7),
    F8(sfKeyF8),
    F9(sfKeyF9),
    F10(sfKeyF10),
    F11(sfKeyF11),
    F12(sfKeyF12),
    F13(sfKeyF13),
    F14(sfKeyF14),
    F15(sfKeyF15),
    PAUSE(sfKeyPause),
    INS(sfKeyInsert),
    DEL(sfKeyDelete),
    UP(sfKeyUp),
    DOWN(sfKeyDown),
    LEFT(sfKeyLeft),
    RIGHT(sfKeyRight),
    SPACE(sfKeySpace),
}

object Keyboard {
    var keypressListener: ((keycode: Int) -> Unit)? = null

    fun isPressed(key: Keys): Boolean {
        val result = sfKeyboard_isKeyPressed(key.keyCode)

        return result == 1
    }

}

