var app10 = angular.module("mycategory", []);

app10.controller("categorys", function ($scope, $http) {

    $scope.categorys = [];
    $http.get('/api/category').then(function (response) {
        $scope.categorys = response.data;
    });

    this.insertCategory = function add() {
        var name = document.getElementById("CategoryName").value;
        // var regex =/^[А-Я][а-я]+$/;
        // var regex =/^[a-z0-9][a-z0-9._\-]*$/;

    //      ^ початок рядка
    //     (?! \ s) переднє твердження для не починати з простору
    //     (?!. * \ s $) попередній вислів, не закінчуючи пробілом
    //     (? =. * [a-zA-Z0-9]) lookahead assertion для atleast одного альфа чи числового символу
    //         [a-zA-Z0-9 '~ ?!] символи, які ми хочемо зіставити (налаштовувати як потрібно)
    //     {2,} відповідає мінімальному 2 і максимальному будь-якій кількості символів з попередньо визначеного класу
    //     $ кінця рядка

        // var regex =/^(?!\s)(?!.*\s$)(?=.*[а-яА-Я0-9])[а-яА-Я0-9 '~?!]{2,}$/;
        // var regex =/^(?!\s)(?!.*\s$)(?=.*[а-яА-Я0-9])[а-яА-Я0-9 '~?!]{2,}$/;
        // var regex =/^[А-Я]([а-яА-Я0-9]|[- @\.#&!])*$/;
        var regex =/^[А-ЯІ]([а-яА-ЯіІ]|[- ])*$/;

        if(regex.test(name)) {
            var req = {
                method: 'POST',
                url: '/api/category/insert',
                data: {
                    name: name
                }
            };

            console.log(req);
            $http(req).then(function (resp) {
                console.log(resp);
                window.location.reload();
            })
        }
        else
            document.getElementById("Regex").innerText = "Поле 'Назва' заповнене не коректно. (Перша буква велика, Мова Українська, Допустимий символи '-' )";

    };



    this.delCategory = function del(id) {
        $http.get('/api/category/del?id=' + id).then(function () {
            window.location.reload();
        });
    };

    this.startUpdateCategory = function startUpdate(id,name) {
        document.getElementById("CategoryIdUPD").innerText = id;
        document.getElementById("CategoryNameUPD").value = name;
    };

    this.updateCategory = function update() {
        var id = document.getElementById("CategoryIdUPD").innerText;
        var name = document.getElementById("CategoryNameUPD").value;

        var regex =/^[А-ЯІ]([а-яА-ЯіІ]|[- ])*$/;
        if(regex.test(name)) {
            var req = {
                method: 'POST',
                url: '/api/category/update?id=' + id,
                data: {
                    name: name
                }
            };
            console.log(req);
            $http(req).then(function (resp) {
                console.log(resp);
                window.location.reload();
            })
        }
        else document.getElementById("RegexUPD").innerText = "Поле 'Назва' заповнене не коректно. (Перша буква велика, Мова Українська, Допустимий символи '-' )";

    };

});
