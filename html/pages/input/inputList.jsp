<%--
  User: Rui
  Date: 2017/12/27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:import url="../htmlframe/headerFrame.jsp" />
<c:import url="../htmlframe/headFrame.jsp" />
<body class="skin-blue">
<!-- header logo: style can be found in header.less -->

<div class="wrapper row-offcanvas row-offcanvas-left">



<!-- Right side column. Contains the navbar and content of the page -->
    <aside class="right-side">
    <!-- Content Header (Page header) -->
            <section class="content-header">
                <h1>
                    DataManagement
                </h1>
                <ol class="breadcrumb">
                    <li><i class="fa fa-dashboard"></i> Index</li>
                </ol>
            </section>

    <!-- Main content -->
            <section class="content">
                    <div class="row">
                        <!-- collection -->
                        <div class="col-xs-12">

                            <div class="nav-tabs-custom">
                                <ul class="nav nav-tabs">
                                    <div class="box-tools">
                                        <div class="input-group">
                                            <input type="text" name="table_search" id="table_search" class="form-control input-sm pull-right" style="width: 150px;" placeholder="Filter">
                                            <div class="input-group-btn">
                                                <button class="btn btn-sm btn-default" id="table_search_btn"><i class="fa fa-search"></i></button>
                                            </div>
                                        </div>
                                    </div>
                                </ul>
                                <div class="tab-content">
                                    <div class="tab-pane active" id="tab_1">
                                        <table class="table table-hover valve-table">
                                            <thead><tr>
                                                <th>弁番号</th>
                                                <th>設置プラント</th>
                                                <th>弁名称</th>
                                                <th>型式</th>
                                                <th>駆動方式</th>
                                                <th>更新日付</th>
                                                <th>操作</th>
                                            </tr></thead>
                                            <tbody>

                                            </tbody>
                                        </table>
                                    </div><!-- /.tab-pane -->
                                </div><!-- /.tab-content -->
                            </div>
                        </div>

                    </div>
            </section><!-- /.content -->
    </aside><!-- /.right-side -->
</div><!-- ./wrapper -->

<!-- add new calendar event modal -->

<script type="text/javascript">
</script>

</body>
</html>