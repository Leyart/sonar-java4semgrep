class BadClassNameCheck {

	// ok:badclassnamecheck
	class CorrectClassName {
	}

	// ok:badclassnamecheck
	enum THIS_IS_AN_ENUM {
	}

	// ruleid:badclassnamecheck
	class incorrectClassName {
	}
}
