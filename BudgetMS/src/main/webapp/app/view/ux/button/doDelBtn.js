Ext.define('BudgetMS.view.ux.button.doDelBtn', {
	extend : 'BudgetMS.view.ux.button.baseBtn',
	alias : 'widget.doDelBtn',
	listeners : {// 暂时就写死吧
		'click' : function(btn, e, eOpts) {
			var btnName = btn.name;// 根据button的name来确定他的ownerCt的类型
			var fieldName;// 字段名称 instId contId invoId
			// var tableName;
			var grid;// grid组件对象
			// grid=btn.ownerCt.ownerCt.ownerCt.ownerCt;grid =
			// Ext.getCmp('instList'); 也可以得到grid
			// btn-panel-instTbarForm-instList
			var tabpanel = Ext.getCmp('mainTabpanel');
			var tab = tabpanel.getActiveTab();
			var grid = tab.down('gridview');
			if (btnName == 'deleteInst') {
				fieldName = 'instId';
			}
			if (btnName == 'deleteCont') {
				fieldName = 'contId';
			}
			if (btnName == 'deleteInvo') {
				fieldName = 'invoId';
			}

			var record = grid.getSelectionModel().getLastSelected();
			if (!record) {
				Ext.MessageBox.alert('注意', '请选中一条记录!');
				return;
			}

			var id = record.data[fieldName];
			var params = {
				id : id
			};
			var url = btn.action;
			debugger;
			var confirm = Ext.Msg.confirm('确认', '是否删除编号为:' + id + '的记录?',
					function(btn) {
						if (btn == 'yes') {
							this.doCRUDAjax(params, url, grid);
						}
					});
		}
	}
});