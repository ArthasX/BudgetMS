Ext.define('BudgetMS.view.ux.button.doUpdBtn', {
	extend : 'BudgetMS.view.ux.button.baseBtn',
	alias:'widget.doUpdBtn',
	listeners : {
		'click' : function(btn, e, eOpts) {
			var win=btn.up('window');
			var form =win.down('form').getForm();
			if(!form.isValid()){
				Ext.Msg.alert('注意','红框处不能为空或格式错误');
				return;
			}
			var record = form.getFieldValues();
			var tabpanel = Ext.getCmp('mainTabpanel');
			var tab = tabpanel.getActiveTab();
			var url = btn.action;// btn action 传参数 inst invo cont?
			var grid = tab.down('gridview');
			this.doCRUDAjax(record, url, grid,win);
		}
	}
});