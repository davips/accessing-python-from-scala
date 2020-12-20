### Installation
Install JDK and [sbt].

Download Scaje:

    git clone https://github.com/davips/accessing-python-from-scala

Setup and activate a python virtual environment and
install jep:
    
    python3.6 -m venv venv
    source venv/bin/activate
    pip install jep
    pip install -e ~/git/a-python-project/
    
Test the installation running the demo.

    sbt run

If you use Intellij Idea,
press Ctrl+Alt+Shift+S and add 
the **lib** folder to *Project Settings -> Libraries*.


[sbt]: https://www.scala-sbt.org/release/docs/Setup.html
